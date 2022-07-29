package test.main;

import java.rmi.Remote;

import test.mypac.RemoteController;

public class MainClass03 {
	public static void main(String[] args) {
		new RemoteController() {			
			@Override
			public void up() {
			System.out.println("속도를 올려요!");				
			}			
			@Override
			public void down() {
			System.out.println("속도를 내려요");			
			}
		};
		
		useRemote(r1);
		
		useRemote(new RemoteController() {

			@Override
			public void up() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void down() {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}

	public static void useRemote(RemoteController remoteController) {
		remoteController.up();
		remoteController.down();
}}
