
class NotificationService{
	public static void sendNotification(Notifiable notifier, String message){
		notifier.send(message);
	}
}