import java.lang.Math;
public class Planet {
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public double calcForceExcertedByX(Planet p){
		double xDist = p.xxPos - this.xxPos;
		double yDist = p.yyPos - this.yyPos;
		double Dist = Math.sqrt(xDist*xDist + yDist*yDist);
		double G = 6.67*10e-11;
		double F = G*this.mass*p.mass/(Dist*Dist);
		double Fx = F*xDist/Dist;
		return Fx;
	}
	        public double calcForceExcertedByY(Planet p){
			double xDist = p.xxPos - this.xxPos;
			double yDist = p.yyPos - this.yyPos;
			double Dist = Math.sqrt(xDist*xDist + yDist*yDist);
			double G = 6.67*10e-11;
			double F = G*this.mass*p.mass/(Dist*Dist);
			double Fy = F*yDist/Dist;
			return Fy;
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

