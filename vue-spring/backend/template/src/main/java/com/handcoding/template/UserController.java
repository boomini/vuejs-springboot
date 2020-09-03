package com.handcoding.template;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
  @GetMapping
  public ResponseVO<?> getUsers() {
    ResponseVO<List<UserVO>> resp = new ResponseVO<>();

    List<UserVO> list = new ArrayList<>();
    list.add(new UserVO("김보민", "010-1111-2222"));
    list.add(new UserVO("테스터", "010-0000-0000"));
    list.add(new UserVO("LSGH", "0100000-0000"));

    resp.setResponse(list);
    return resp;
  }

  @GetMapping("/{id}")
  public ResponseVO<?> getUser(@PathVariable int id) {
    ResponseVO<UserVO> resp = new ResponseVO<>();

    List<UserVO> list = new ArrayList<>();
    list.add(new UserVO("김보민", "010-1111-2222"));
    list.add(new UserVO("테스터", "010-0000-0000"));
    list.add(new UserVO("LSGH", "0100000-0000"));

    resp.setResponse(list.get(id));
    return resp;
  }

}