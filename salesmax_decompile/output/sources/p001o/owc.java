package p001o;

/* loaded from: classes5.dex */
public enum owc {
    CustomData("custom_data"),
    OperationalData("operational_data"),
    CustomAndOperationalData("custom_and_operational_data");

    private final String value;

    owc(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
