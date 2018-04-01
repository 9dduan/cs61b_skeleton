import java.lang.Math;
public class Planet {
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public double calcDistance(Planet p){
		double xDist = p.xxPos - this.xxPos;
		double yDist = p.yyPos - this.yyPos;
		double Dist = Math.sqrt(xDist*xDist + yDist*yDist);
		return Dist;
		}

	public double calcForceExcertedByX(Planet[] allPlanets){
	        int i; 
		double xDist;
                double sum = 0.0;	
		double G=6.67*10e-11; 
		double F;
		double Fx; 
		for(i = 0;i<allPlanets.length;i++){
			F = G*this.mass*allPlanets[i].mass/this.calcDistance(allPlanets[i]);
			Fx = F*(allPlanets[i].xxPos - this.xxPos)/this.calcDistance(allPlanets[i]);
			sum = sum + Fx;
		};
		return sum;	
	}
	        public double calcForceExcertedByY(Planet[] allPlanets){
			
		 	int i;	
		        
			double G = 6.67*10e-11;
			double F ;
			double Fy;
		 	double sum = 0.0;
			for(i=0;i<allPlanets.length;i++){
				F = G*this.mass*allPlanets[i].mass/this.calcDistance(allPlanets[i]);
				Fy = F*(allPlanets[i].yyPos - this.yyPos)/this.calcDistance(allPlanets[i]);
				sum = sum + Fy;
			}
			return sum;
		}



	public Planet(Planet p){
		this.xxPos = p.xxPos;
		this.yyPos = p.yyPos;
		this.xxVel = p.xxVel;
		this.yyVel = p.yyVel;
		this.mass = p.mass;
		this.imgFileName = p.imgFileName;
	}


	public Planet(double xP, double yP, double xV, double yV, double m, String img){
		this.xxPos = xP;
		this.yyPos = yP;
		this.xxVel = xV;
		this.yyVel = yV;
		this.mass = m;
		this.imgFileName = img;


}
}

