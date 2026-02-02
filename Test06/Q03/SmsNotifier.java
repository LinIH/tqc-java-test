
class SmsNotifier implements Notifiable{

	public void send(String message){
		System.out.println("Sending SMS: " + message);
	}
}