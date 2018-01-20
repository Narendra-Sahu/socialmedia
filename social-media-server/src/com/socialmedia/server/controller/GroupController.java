package com.socialmedia.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialmedia.server.pojo.Group;
import com.socialmedia.server.pojo.Topic;
import com.socialmedia.server.pojo.User;
import com.socialmedia.server.service.IGroupService;
import com.socialmedia.server.service.IUserService;

@RestController
@RequestMapping("/g")
public class GroupController {

	@Autowired
	private IGroupService groupService;
	
	@RequestMapping("/{groupId}")
	public ResponseEntity<?> getGroupData(@PathVariable int groupId) {
		try{
			List<Topic> list=groupService.loadGroup(groupId);
			return new ResponseEntity<List<Topic>>(list, HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<String>("Not found.....", HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping("/createGroup")
	public ResponseEntity<?> createGroup(@RequestBody User user,@RequestBody Group group) {
		try{
			Group g=groupService.createGroup(user, group);
			return new ResponseEntity<Group>(g, HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<String>("Cannot create Group",HttpStatus.NOT_IMPLEMENTED);
		}		
	}
}
