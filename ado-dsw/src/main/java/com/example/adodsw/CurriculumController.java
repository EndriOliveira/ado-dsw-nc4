package com.example.adodsw;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dto.Professions;
import com.example.dto.courses;

@Controller
public class CurriculumController {
  @GetMapping
  String getCurriculum(Model model) {

    String[] c1Capacities = {"Formatação de documentos em Word", "Principais funções(SE, CONT.SE, SOMA, etc.) e formatação em Excel", "Formatações e criação de apresentações em PowerPoint"};
    String[] c2Capacities = {"Desenvolvimento e introdução à lógica de programação", "Desenvolvimento de aplicações Web e Desktop", "Engenharia de software"};
    String[] p1Capacities = {"Desenvolvimento de APIs com Node.js", "Testes unitários", "Chat em tempo real", "Desenvolvimento com design patterns"};
    String[] p2Capacities = {"Estudos de tecnologias presentes no desenvolvimento web(frontend, backend, banco de dados, etc.)"};

    courses c1 = new courses("Informática Básica - Pacote Office 2013", c1Capacities, "SENAI", 2020);
    courses c2 = new courses("Tecnólogo em Análise e Desenvolvimento de Sistemas", c2Capacities, "SENAC", 2024);
    Professions p1 = new Professions("Desenvolvedor Node.js Jr", p1Capacities, "IT Lean", "01/2023 - Atual");
    Professions p2 = new Professions("Estágiário", p2Capacities, "IT Lean", "01/2022 - 12/2022");
    model.addAttribute("name", "Endrio Oliveira de Jesus");
    model.addAttribute("birthDate", "22 de Março de 2004");
    model.addAttribute("email", "endriojesus76@gmail.com");
    model.addAttribute("courses", Arrays.asList(c1, c2));
    model.addAttribute("professions", Arrays.asList(p1, p2));
    model.addAttribute("tools", Arrays.asList("HTML5 & CSS3", "JavaScript", "TypeScript", "Git", "Node.js", "MySQL", "PostgreSQL"));
    model.addAttribute("languages", Arrays.asList("Inglês - Intermediário"));

    return "curriculum";
  }
}
