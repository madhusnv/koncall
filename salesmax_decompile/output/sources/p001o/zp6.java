package p001o;

import j$.time.DayOfWeek;

/* loaded from: classes6.dex */
public abstract class zp6 {
    /* renamed from: a */
    public static final int m59675a(DayOfWeek dayOfWeek, DayOfWeek dayOfWeek2) {
        sq8.m48649h(dayOfWeek, "<this>");
        sq8.m48649h(dayOfWeek2, "other");
        return ((dayOfWeek2.getValue() - dayOfWeek.getValue()) + 7) % 7;
    }
}
