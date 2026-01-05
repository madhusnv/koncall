package org.apache.http.conn.ssl;

import org.apache.http.util.Args;

/* loaded from: classes6.dex */
final class SubjectName {
    static final int DNS = 2;
    static final int IP = 7;

    /* renamed from: type, reason: collision with root package name */
    private final int f58180type;
    private final String value;

    public SubjectName(String str, int i) {
        this.value = (String) Args.notNull(str, "Value");
        this.f58180type = Args.positive(i, "Type");
    }

    public static SubjectName DNS(String str) {
        return new SubjectName(str, 2);
    }

    public static SubjectName IP(String str) {
        return new SubjectName(str, 7);
    }

    public int getType() {
        return this.f58180type;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }
}
