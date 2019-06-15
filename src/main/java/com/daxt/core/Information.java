package com.daxt.core;


public class Information {
    private String topic;
    private String name;
    private Object value;

    public Information(String name, Object value) {
        this(null, name, value);
    }

    public Information(String topic, String name, Object value) {
        this.setTopic(topic);
        this.setName(name);
        this.setValue(value);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        if (topic != null) {
            this.topic = topic;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String toString() {
        return "<Information [" + this.topic + "]: " + this.name + "=" + this.value + ">";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Information) {
            Information other = (Information) obj;
            return this.topic.equals(other.topic) && this.name.equals(other.name) && this.value == other.value;
        }
        return false;
    }
}
