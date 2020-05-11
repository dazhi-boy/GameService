package com.dazhi.game.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dazhi.game.common.Result;

@Controller
@ResponseBody
public class LoginController {
	@RequestMapping("/login")
	public Result login(String username, String password) {

		return Result.ok("OK", "token");
	}
}
