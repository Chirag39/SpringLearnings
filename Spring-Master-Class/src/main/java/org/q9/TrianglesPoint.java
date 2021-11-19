package org.q9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


	public class TrianglesPoint implements InitializingBean, DisposableBean{
		private Point pointA;
		private Point pointB;
		private Point pointC;
//		private ApplicationContext context=null;
		
		public Point getPointA() {
			return pointA;
		}
		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}
		public Point getPointB() {
			return pointB;
		}
		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}
		public Point getPointC() {
			return pointC;
		}
		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}
		
		public void draw() {
			System.out.println("Point A = ["+ getPointA().getX()+","+ getPointA().getX()+"]");
			System.out.println("Point B = ["+ getPointB().getX()+","+ getPointB().getX()+"]");
			System.out.println("Point C = ["+ getPointC().getX()+","+ getPointC().getX()+"]");

		}
		
		
		public void init() {
			System.out.println("My init method called before beans");
		}
		
		public void cleanup() {
			System.out.println("My init method called after beans");
		}
		
		
		
//		class implements InitializingBean
		public void afterPropertiesSet() throws Exception {
			System.out.println("Initializing beans init method called for TrianglesPoint");
		}
		
		
//		class implements DisposableBean
		public void destroy() throws Exception {
			System.out.println("Destroying bean called customer");
		}
	}

