package com.kodilla.good.patterns.challenges2;

public class Producer {
    private String producerName;
    private String contactEmailAddress;



    public Producer(String producerName, String contactEmailAddress) {
        this.producerName = producerName;
        this.contactEmailAddress = contactEmailAddress;
    }

    public String getProducerName() {
        return producerName;
    }

    public String contactEmailAddress() {
        return contactEmailAddress;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "producerName='" + producerName + '\'' +
                ", producerId=" + contactEmailAddress +
                '}';
    }
}
