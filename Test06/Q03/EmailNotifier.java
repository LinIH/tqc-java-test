
class EmailNotifier implements Notifiable{

	public void send(String message){
		System.out.println("Sending Email: " + message);
	}
}