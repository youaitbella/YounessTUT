package de.youness.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.youness.demo.entity.Agent;
import de.youness.demo.repository.AgentRepository;

@Controller
public class MainController {

	@Autowired
	private AgentRepository agentRepository;
	
	public static final String[] NAMES = new String[] {"Tom", "Jerry", "Donald", "Ait Bella"};
	
	@ResponseBody
    @RequestMapping("/")
	public String home() {
		String html="";
		html += "<ul>";
        html += " <li><a href='/testInsert'>Test Insert</a></li>";
        html += " <li><a href='/showAllAgent'>Show All Agent</a></li>";
        html += " <li><a href='/showFullNameLikeAitBella'>Show All 'Ait Bella'</a></li>";
        html += " <li><a href='/deleteAllAgent'>Delete All Agent</a></li>";
        html += "</ul>";
		return html;
	}
	
	
 
    @ResponseBody
    @RequestMapping("/showAllAgent")
    public String showAllAgent() {
 
        Iterable<Agent> agents = this.agentRepository.findAll();
 
        String html = "";
        for (Agent agent : agents) {
            html += agent + "<br>";
        }
 
        return html;
    }
 
    @ResponseBody
    @RequestMapping("/showFullNameLikeTom")
    public String showFullNameLikeTom() {
 
        List<Agent> agents = this.agentRepository.findByName("Ait Bella");
 
        String html = "";
        for (Agent agent : agents) {
            html += agent + "<br>";
        }
 
        return html;
    }
 
    @ResponseBody
    @RequestMapping("/deleteAgent")
    public String deleteAllAgent() {
 
        this.agentRepository.deleteAll();
        return "Deleted!";
    }
	
	
}
