package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: j$.time.format.a */
/* loaded from: classes2.dex */
public final class C3431a extends C3456z {

    /* renamed from: d */
    public final /* synthetic */ C3455y f18135d;

    public C3431a(C3455y c3455y) {
        this.f18135d = c3455y;
    }

    @Override // j$.time.format.C3456z
    /* renamed from: b */
    public final String mo7950b(Chronology chronology, TemporalField temporalField, long j6, TextStyle textStyle, Locale locale) {
        return this.f18135d.m7993a(j6, textStyle);
    }

    @Override // j$.time.format.C3456z
    /* renamed from: c */
    public final String mo7951c(TemporalField temporalField, long j6, TextStyle textStyle, Locale locale) {
        return this.f18135d.m7993a(j6, textStyle);
    }

    @Override // j$.time.format.C3456z
    /* renamed from: d */
    public final Iterator mo7952d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f18135d.f18215b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.C3456z
    /* renamed from: e */
    public final Iterator mo7953e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f18135d.f18215b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
