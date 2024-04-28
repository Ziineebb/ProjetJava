package springDataApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springDataApp.dao.Admin;
import springDataApp.dao.Candidat;
import springDataApp.dao.Electeur;
import springDataApp.dao.Election;
import springDataApp.dao.Resultat;
import springDataApp.dao.Vote;
import springDataApp.services.IGestionElections;
import springDataApp.services.IGestionPersonne;
import springDataApp.services.IGestionResultat;
import springDataApp.services.IGestionVote;

@SpringBootApplication
public class ProjectSpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ProjectSpringBoot1Application.class, args);
		IGestionPersonne gp=ctx.getBean(IGestionPersonne.class);
		IGestionElections ge=ctx.getBean(IGestionElections.class);
		IGestionVote gv=ctx.getBean(IGestionVote.class);
		IGestionResultat gr=ctx.getBean(IGestionResultat.class);
		Electeur E=new Electeur();
		E.setNom("Safaa");
		E.setPrenom("Safaa");
		E.setAdresse("Rabat");
		E.setAge(20);
		E.setEmail("safaa@gmail.com");
		E.setSexe("Femme");
		E.setPwd("safaa");
		E.setNum(6785634);
		
		Admin a=new Admin();
		a.setNom("zineb");
		a.setPrenom("zineb");
		a.setNum(701241202);
		a.setEmail("zineb@gmail.com");
		a.setPwd("zineb");
		
		Candidat c=new Candidat();
		c.setNom("aya");
		c.setPrenom("aya");
		c.setEmail("aya@gmail.com");
		c.setParti("parti1");
		c.setRegion("region1");
		c.setPwd("aya");
	
		
		
		Election El=new Election();
		El.setDateDebut("12/2/2024");
		El.setDateFin("14/2/2024");
		El.setStatus("en cours");
		El.setTitre("Election1");
		El.setType("Type1");
		
		Vote v=new Vote();
		v.setDateVote("12/2/2024");
		v.setEl(El);
		v.setC(c);
		
		Resultat r=new Resultat();
		r.setE(El);
		r.setNbreVote(20);
		r.setC(c);
		
	    gp.save(c);
		ge.save(El);
		gp.save(a);
		gp.save(E);
		gv.save(v);
		gr.save(r);
		
		
		
		
		
		
	}

}
