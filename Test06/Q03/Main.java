// Main.java (for testing)
public class Main {
    public static void main(String[] args) {
        // 建立不同的通知器
        Notifiable email = new EmailNotifier();
        Notifiable sms = new SmsNotifier();

        // 使用通知服務發送訊息
        NotificationService.sendNotification(email, "Your order has been shipped.");
        NotificationService.sendNotification(sms, "Your verification code is 12345.");
    }
}
// 預期輸出:
// Sending Email: Your order has been shipped.
// Sending SMS: Your verification code is 12345.