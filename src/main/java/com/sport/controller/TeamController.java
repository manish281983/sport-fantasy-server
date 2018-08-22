package com.sport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sport.modal.Team;
import com.sport.repository.TeamRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/team") // This means URL's start with /demo (after Application path)
public class TeamController {
	@Autowired 
	private TeamRepository teamRepository;

		//$ curl 'localhost:8080/demo/team?name=India'
		@GetMapping(path="/add") 
		public @ResponseBody Team addNewTeam (@RequestParam String name, @RequestParam String theme, @RequestParam String logo) {
			Team n = new Team();
			n.setName(name);
			n.setTheme(theme);
			n.setLogo(logo);
			teamRepository.save(n);
			return n;
		}
		
		@GetMapping(path="/edit") 
		public @ResponseBody Team editTeam (@RequestParam Integer id, @RequestParam String name, @RequestParam String theme, @RequestParam String logo) {
			Team n = new Team();
			n.setId(id);
			n.setTheme(theme);
			n.setName(name);
			n.setLogo(logo);
			teamRepository.save(n);
			return n;
		}
		
	@GetMapping(path="/delete") 
	public @ResponseBody Team deleteTeam (@RequestParam Integer id) {
		Team n = new Team();
		n.setId(id);
		teamRepository.delete(n);
		return n;
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Team> getAllTeam() {
		return teamRepository.findAll();
	}
}