public class ConsumerRecord {
    public static void sendEmailNotification(List<consumer__c> con) {
        for (consumer__c c : con) {
            Messaging.SingleEmailMessage email = new Messaging.SingleEmailMessage();
            email.setToAddresses(new List<String>{c.email__c});
            email.setSubject('Welcome to our company');
            email.setPlainTextBody(
                'Dear ' + c.Name + ',\n\n' +
                'Welcome to MY RICE! You have been seen as a valuable customer to us. Please continue your journey with us, while we try to provide you with good quality resources.' + '\n\n' +
                'We are proud to associate with valuable customers like you and we look forward to collaborating with you by providing more and more exciting discounts or even product offers too.' + '\n\n' +
                'So why take a step back? Take a leap of faith and shop with us more, while we provide you with valuable products and offers.' + '\n\n' +
                'Thank you for buying. Here are some of the products that are brought by the customers who similarly bought products like this.' + '\n\n'
            );
            Messaging.sendEmail(new List<Messaging.SingleEmailMessage>{email});
        }
    }
}
