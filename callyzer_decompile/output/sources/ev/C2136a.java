package ev;

import a2.AbstractC0030c;
import av.EnumC0460c;
import com.sun.mail.util.AbstractC1452a;
import g2.h4;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import mm.C4800k;
import om.C5414p;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ev.a */
/* loaded from: classes3.dex */
public final class C2136a {

    /* renamed from: a */
    public final C5414p f9969a;

    /* renamed from: b */
    public final List f9970b;

    /* renamed from: c */
    public final List f9971c;

    /* renamed from: d */
    public final String f9972d;

    /* renamed from: e */
    public final boolean f9973e;

    /* renamed from: f */
    public final boolean f9974f;

    /* renamed from: g */
    public final String f9975g;

    /* renamed from: h */
    public final String f9976h;

    /* renamed from: i */
    public final C4800k f9977i;

    /* renamed from: j */
    public final LocalDateTime f9978j;

    /* renamed from: k */
    public final boolean f9979k;

    /* renamed from: l */
    public final boolean f9980l;

    /* renamed from: m */
    public final boolean f9981m;

    /* renamed from: n */
    public final String f9982n;

    /* renamed from: o */
    public final List f9983o;

    /* renamed from: p */
    public final int f9984p;

    /* renamed from: q */
    public final boolean f9985q;

    /* renamed from: r */
    public final boolean f9986r;

    /* renamed from: s */
    public final Integer f9987s;

    /* renamed from: t */
    public final Integer f9988t;

    /* renamed from: u */
    public final h4 f9989u;

    /* renamed from: v */
    public final List f9990v;

    /* renamed from: w */
    public final EnumC0460c f9991w;

    /* renamed from: x */
    public final C6361k f9992x;

    public C2136a(C5414p c5414p, List leadStatusList, List leadRecentNoteList, String str, boolean z6, boolean z10, String str2, String str3, C4800k c4800k, LocalDateTime localDateTime, boolean z11, boolean z12, boolean z13, String str4, List connectedSimList, int i10, boolean z14, boolean z15, Integer num, Integer num2, h4 h4Var, List list, EnumC0460c noteSavedState, C6361k c6361k) {
        AbstractC4154l.m8923f(leadStatusList, "leadStatusList");
        AbstractC4154l.m8923f(leadRecentNoteList, "leadRecentNoteList");
        AbstractC4154l.m8923f(connectedSimList, "connectedSimList");
        AbstractC4154l.m8923f(noteSavedState, "noteSavedState");
        this.f9969a = c5414p;
        this.f9970b = leadStatusList;
        this.f9971c = leadRecentNoteList;
        this.f9972d = str;
        this.f9973e = z6;
        this.f9974f = z10;
        this.f9975g = str2;
        this.f9976h = str3;
        this.f9977i = c4800k;
        this.f9978j = localDateTime;
        this.f9979k = z11;
        this.f9980l = z12;
        this.f9981m = z13;
        this.f9982n = str4;
        this.f9983o = connectedSimList;
        this.f9984p = i10;
        this.f9985q = z14;
        this.f9986r = z15;
        this.f9987s = num;
        this.f9988t = num2;
        this.f9989u = h4Var;
        this.f9990v = list;
        this.f9991w = noteSavedState;
        this.f9992x = c6361k;
    }

    /* renamed from: a */
    public static C2136a m5817a(C2136a c2136a, C5414p c5414p, List list, List list2, String str, boolean z6, String str2, C4800k c4800k, LocalDateTime localDateTime, boolean z10, boolean z11, String str3, List list3, int i10, boolean z12, Integer num, Integer num2, h4 h4Var, List list4, EnumC0460c enumC0460c, C6361k c6361k, int i11) {
        C5414p c5414p2 = (i11 & 1) != 0 ? c2136a.f9969a : c5414p;
        c2136a.getClass();
        c2136a.getClass();
        List leadStatusList = (i11 & 8) != 0 ? c2136a.f9970b : list;
        List leadRecentNoteList = (i11 & 16) != 0 ? c2136a.f9971c : list2;
        String note = (i11 & 32) != 0 ? c2136a.f9972d : str;
        c2136a.getClass();
        boolean z13 = (i11 & 128) != 0 ? c2136a.f9973e : z6;
        boolean z14 = (i11 & 256) != 0 ? c2136a.f9974f : false;
        c2136a.getClass();
        String str4 = c2136a.f9975g;
        String errorMessage = (i11 & NewHope.SENDB_BYTES) != 0 ? c2136a.f9976h : str2;
        C4800k c4800k2 = (i11 & 4096) != 0 ? c2136a.f9977i : c4800k;
        LocalDateTime localDateTime2 = (i11 & 8192) != 0 ? c2136a.f9978j : localDateTime;
        boolean z15 = (i11 & 16384) != 0 ? c2136a.f9979k : z10;
        boolean z16 = (32768 & i11) != 0 ? c2136a.f9980l : z11;
        boolean z17 = (65536 & i11) != 0 ? c2136a.f9981m : true;
        String leadId = (131072 & i11) != 0 ? c2136a.f9982n : str3;
        List connectedSimList = (i11 & 262144) != 0 ? c2136a.f9983o : list3;
        int i12 = (i11 & 524288) != 0 ? c2136a.f9984p : i10;
        boolean z18 = (i11 & 1048576) != 0 ? c2136a.f9985q : z12;
        boolean z19 = (i11 & 2097152) != 0 ? c2136a.f9986r : false;
        Integer num3 = (i11 & 4194304) != 0 ? c2136a.f9987s : num;
        Integer num4 = (i11 & 8388608) != 0 ? c2136a.f9988t : num2;
        h4 h4Var2 = (i11 & 16777216) != 0 ? c2136a.f9989u : h4Var;
        List templatesItems = (i11 & 33554432) != 0 ? c2136a.f9990v : list4;
        C5414p c5414p3 = c5414p2;
        EnumC0460c noteSavedState = (i11 & 67108864) != 0 ? c2136a.f9991w : enumC0460c;
        boolean z20 = z13;
        C6361k isNotValidTitle = (i11 & 134217728) != 0 ? c2136a.f9992x : c6361k;
        c2136a.getClass();
        AbstractC4154l.m8923f(leadStatusList, "leadStatusList");
        AbstractC4154l.m8923f(leadRecentNoteList, "leadRecentNoteList");
        AbstractC4154l.m8923f(note, "note");
        AbstractC4154l.m8923f(errorMessage, "errorMessage");
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(connectedSimList, "connectedSimList");
        AbstractC4154l.m8923f(templatesItems, "templatesItems");
        AbstractC4154l.m8923f(noteSavedState, "noteSavedState");
        AbstractC4154l.m8923f(isNotValidTitle, "isNotValidTitle");
        return new C2136a(c5414p3, leadStatusList, leadRecentNoteList, note, z20, z14, str4, errorMessage, c4800k2, localDateTime2, z15, z16, z17, leadId, connectedSimList, i12, z18, z19, num3, num4, h4Var2, templatesItems, noteSavedState, isNotValidTitle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2136a)) {
            return false;
        }
        C2136a c2136a = (C2136a) obj;
        return AbstractC4154l.m8918a(this.f9969a, c2136a.f9969a) && AbstractC4154l.m8918a(this.f9970b, c2136a.f9970b) && AbstractC4154l.m8918a(this.f9971c, c2136a.f9971c) && this.f9972d.equals(c2136a.f9972d) && this.f9973e == c2136a.f9973e && this.f9974f == c2136a.f9974f && this.f9975g.equals(c2136a.f9975g) && this.f9976h.equals(c2136a.f9976h) && AbstractC4154l.m8918a(this.f9977i, c2136a.f9977i) && AbstractC4154l.m8918a(this.f9978j, c2136a.f9978j) && this.f9979k == c2136a.f9979k && this.f9980l == c2136a.f9980l && this.f9981m == c2136a.f9981m && this.f9982n.equals(c2136a.f9982n) && AbstractC4154l.m8918a(this.f9983o, c2136a.f9983o) && this.f9984p == c2136a.f9984p && this.f9985q == c2136a.f9985q && this.f9986r == c2136a.f9986r && AbstractC4154l.m8918a(this.f9987s, c2136a.f9987s) && AbstractC4154l.m8918a(this.f9988t, c2136a.f9988t) && this.f9989u.equals(c2136a.f9989u) && this.f9990v.equals(c2136a.f9990v) && this.f9991w == c2136a.f9991w && AbstractC4154l.m8918a(this.f9992x, c2136a.f9992x);
    }

    public final int hashCode() {
        C5414p c5414p = this.f9969a;
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f9971c, AbstractC1452a.m4559f(this.f9970b, (c5414p == null ? 0 : c5414p.hashCode()) * 29791, 31), 31), 31, this.f9972d), 31, false), 31, this.f9973e), 31, this.f9974f), 31, true), 31, this.f9975g), 31, this.f9976h);
        C4800k c4800k = this.f9977i;
        int iHashCode = (iM113d + (c4800k == null ? 0 : c4800k.hashCode())) * 31;
        LocalDateTime localDateTime = this.f9978j;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f9984p, AbstractC1452a.m4559f(this.f9983o, AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31, this.f9979k), 31, this.f9980l), 31, this.f9981m), 31, this.f9982n), 31), 31), 31, this.f9985q), 31, this.f9986r);
        Integer num = this.f9987s;
        int iHashCode2 = (iM4558e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9988t;
        return this.f9992x.hashCode() + ((this.f9991w.hashCode() + AbstractC1452a.m4559f(this.f9990v, (this.f9989u.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NoteState(callLog=");
        sb2.append(this.f9969a);
        sb2.append(", callLogId=null, callNumber=null, leadStatusList=");
        sb2.append(this.f9970b);
        sb2.append(", leadRecentNoteList=");
        sb2.append(this.f9971c);
        sb2.append(", note=");
        sb2.append(this.f9972d);
        sb2.append(", saveNoteFailed=false, micPermissionGranted=");
        AbstractC0030c.m133x(sb2, this.f9973e, ", isMicListening=", this.f9974f, ", lockBelt=true, micRecognizedText=");
        a1.m14319B(sb2, this.f9975g, ", errorMessage=", this.f9976h, ", selectedLeadStatus=");
        sb2.append(this.f9977i);
        sb2.append(", selectedReminderTime=");
        sb2.append(this.f9978j);
        sb2.append(", inProcess=");
        AbstractC0030c.m133x(sb2, this.f9979k, ", isLeadNote=", this.f9980l, ", isLeadSubExpired=");
        AbstractC4801l.m9751y(sb2, this.f9981m, ", leadId=", this.f9982n, ", connectedSimList=");
        sb2.append(this.f9983o);
        sb2.append(", simSlot=");
        sb2.append(this.f9984p);
        sb2.append(", clickEnabled=");
        AbstractC0030c.m133x(sb2, this.f9985q, ", hasReminderDateTimeError=", this.f9986r, ", leadStatusError=");
        sb2.append(this.f9987s);
        sb2.append(", leadReminderError=");
        sb2.append(this.f9988t);
        sb2.append(", datePickerState=");
        sb2.append(this.f9989u);
        sb2.append(", templatesItems=");
        sb2.append(this.f9990v);
        sb2.append(", noteSavedState=");
        sb2.append(this.f9991w);
        sb2.append(", isNotValidTitle=");
        sb2.append(this.f9992x);
        sb2.append(")");
        return sb2.toString();
    }
}
