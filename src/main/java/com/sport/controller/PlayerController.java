package com.sport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sport.modal.Player;
import com.sport.repository.PlayerRepository;

@Controller    
@RequestMapping(path="/player") 
public class PlayerController {
	@Autowired 
	private PlayerRepository playerRepository;

		//$ curl 'localhost:8080/demo/player?name=India'
		@GetMapping(path="/add") 
		public @ResponseBody Player addNewPlayer (@RequestParam String name, @RequestParam String specialist, @RequestParam String role,@RequestParam Integer teamId ) {
			Player n = new Player();
			n.setSpecialist(specialist);
			n.setRole(role);
			n.setName(name);
			n.setTeamId(teamId);
			playerRepository.save(n);
			return n;
		}
		
		@GetMapping(path="/edit") 
		public @ResponseBody Player editPlayer (@RequestParam Integer id, @RequestParam String name, @RequestParam String specialist, @RequestParam String role,@RequestParam Integer teamId) {
			Player n = new Player();
			n.setId(id);
			n.setSpecialist(specialist);
			n.setRole(role);
			n.setName(name);
			n.setTeamId(teamId);
			playerRepository.save(n);
			return n;
		}
		
	@GetMapping(path="/delete") 
	public @ResponseBody Player deletePlayer (@RequestParam Integer id) {
		Player n = new Player();
		n.setId(id);
		playerRepository.delete(n);
		return n;
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Player> getAllPlayer() {
		return playerRepository.findAll();
	}
}