package mindustry.logic;

public enum MessageType{
    notify,
    announce,
    toast,
    label,
    mission;

    public static final MessageType[] all = values();
}
