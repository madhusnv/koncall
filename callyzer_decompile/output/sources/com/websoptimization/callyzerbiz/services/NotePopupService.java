package com.websoptimization.callyzerbiz.services;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ap.InterfaceC0394g;
import com.websoptimization.callyzerbiz.NotePopUpActivity;
import com.websoptimization.callyzerbiz.common.exception.DataNotFoundException;
import gm.C2648q;
import gm.C2651t;
import gw.C2746h;
import im.p1;
import iw.InterfaceC3359b;
import kn.EnumC4127g;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import og.wc;
import om.C5415q;
import pg.y8;
import po.C5984e;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class NotePopupService extends Service implements InterfaceC3359b {

    /* renamed from: a */
    public volatile C2746h f7424a;

    /* renamed from: b */
    public final Object f7425b = new Object();

    /* renamed from: c */
    public boolean f7426c = false;

    /* renamed from: d */
    public final String f7427d = "NotePopupService";

    /* renamed from: e */
    public C8805t f7428e;

    /* renamed from: f */
    public C5984e f7429f;

    /* renamed from: g */
    public C4494g f7430g;

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        if (this.f7424a == null) {
            synchronized (this.f7425b) {
                try {
                    if (this.f7424a == null) {
                        this.f7424a = new C2746h(this);
                    }
                } finally {
                }
            }
        }
        return this.f7424a.mo1432a();
    }

    /* renamed from: b */
    public final Notification m5034b(Intent intent, C5415q c5415q) {
        String str;
        String str2;
        Intent intent2 = new Intent(this, (Class<?>) NotePopUpActivity.class);
        intent2.putExtra("note_popup", intent.getStringExtra("note_popup"));
        intent2.putExtra("is_from_notification", "true");
        PendingIntent pendingIntentM11947b = y8.m11947b(this, intent2);
        String str3 = "";
        if (c5415q == null || (str = c5415q.f27200f) == null) {
            str = "";
        }
        String strValueOf = c5415q != null ? Integer.valueOf(c5415q.f27202h) : "";
        if (c5415q != null && (str2 = c5415q.f27201g) != null) {
            str3 = str2;
        }
        String str4 = "Tap to add notes for " + str + ", (+" + strValueOf + str3 + ")";
        C5984e c5984e = this.f7429f;
        if (c5984e != null) {
            return C5984e.m12016g(c5984e, 404, "Notes", str4, EnumC4127g.Floating, pendingIntentM11947b, false, null, true, null, 736).m16507a(this);
        }
        AbstractC4154l.m8928k("notificationUseCase");
        throw null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC4154l.m8923f(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f7426c) {
            this.f7426c = true;
            C2651t c2651t = ((C2648q) ((InterfaceC0394g) mo1432a())).f14272a;
            this.f7428e = c2651t.m6633w();
            this.f7429f = c2651t.m6624n();
            this.f7430g = c2651t.m6628r();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C8805t c8805t = this.f7428e;
        if (c8805t == null) {
            AbstractC4154l.m8928k("traceLog");
            throw null;
        }
        c8805t.m16232g(this.f7427d, "onDestroy: notification removed..");
        C4494g c4494g = this.f7430g;
        if (c4494g == null) {
            AbstractC4154l.m8928k("sessionConfigurationUseCase");
            throw null;
        }
        c4494g.m9337b(p1.NOTE_POPUP_CALL_DETAILS, null);
        C5984e c5984e = this.f7429f;
        if (c5984e == null) {
            AbstractC4154l.m8928k("notificationUseCase");
            throw null;
        }
        c5984e.m12019a(404);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        AbstractC4154l.m8923f(intent, "intent");
        C4494g c4494g = this.f7430g;
        if (c4494g == null) {
            AbstractC4154l.m8928k("sessionConfigurationUseCase");
            throw null;
        }
        C5415q c5415q = (C5415q) c4494g.m9336a(p1.NOTE_POPUP_CALL_DETAILS);
        try {
            wc.m11032b(this, 404, m5034b(intent, c5415q));
        } catch (Exception e2) {
            C8805t c8805t = this.f7428e;
            if (c8805t == null) {
                AbstractC4154l.m8928k("traceLog");
                throw null;
            }
            c8805t.m16239n("NotePopupService Exception-", e2);
        }
        if (c5415q == null) {
            C8805t c8805t2 = this.f7428e;
            if (c8805t2 == null) {
                AbstractC4154l.m8928k("traceLog");
                throw null;
            }
            c8805t2.m16239n(this.f7427d, new DataNotFoundException("call log is null"));
            stopSelf();
            return 2;
        }
        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) NotePopUpActivity.class);
        intent2.addFlags(268533760);
        intent2.addFlags(268435456);
        C8805t c8805t3 = this.f7428e;
        if (c8805t3 == null) {
            AbstractC4154l.m8928k("traceLog");
            throw null;
        }
        c8805t3.m16231f("lead complete call notes popup >>> service running, calling note popup activity");
        getApplicationContext().startActivity(intent2);
        return 2;
    }
}
