package com.dazhi.game.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dazhi.game.chat.MyOneToOneServer;

@Controller
public class SocketController {

	@Autowired
	private MyOneToOneServer myOneToOneServer;
	@RequestMapping("/index")
	public String index() {
		System.out.print("--------------------------");
		return "index";
	}

	/**
	*
	* 服务端页面
	* @param model
	* @return
	*/
	@RequestMapping(value = "/admin")
	public String admin(Model model) {
		int num = myOneToOneServer.getOnlineNum();
		List<String> list = myOneToOneServer.getOnlineUsers();

		model.addAttribute("num", num);
		model.addAttribute("users", list);
		return "admin";
	}

	/**
	* 个人信息推送
	* @return
	*/
	@RequestMapping("sendmsg")
	@ResponseBody
	public String sendmsg(String msg, String username) {
		// 第一个参数 :msg 发送的信息内容
		// 第二个参数为用户长连接传的用户人数
		String[] persons = username.split(",");
		myOneToOneServer.SendMany(msg, persons);
		return "success";
	}

	/**
	 * 推送给所有在线用户
	 * @return
	 */
	@RequestMapping("sendAll")
	@ResponseBody
	public String sendAll(String msg) {
		myOneToOneServer.sendAll(msg);
		return "success";
	}
}
