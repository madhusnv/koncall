package p001o;

/* loaded from: classes3.dex */
public enum qw6 {
    JSON(".json"),
    ZIP(".zip");

    public final String extension;

    qw6(String str) {
        this.extension = str;
    }

    public static qw6 forFile(String str) {
        for (qw6 qw6Var : values()) {
            if (str.endsWith(qw6Var.extension)) {
                return qw6Var;
            }
        }
        rja.m46866c("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
