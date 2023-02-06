package Assignment_1.Needed_Files;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
        
    	Network objNetwork = new Network("network");            /* Activate the network */

        //objNetwork.run();
        Thread networkThread = new Thread(objNetwork);
        networkThread.start();

        Server objServer = new Server();

        Thread serverThread = new Thread(objServer);

        serverThread.start();

        Client sendingClient = new Client("sending");
        Thread sendingClientThread = new Thread(sendingClient);

        sendingClientThread.start();

        Client recievingClient = new Client("receiving");
        Thread recievingClientThread = new Thread(recievingClient);

        recievingClientThread.start();
    }
}
