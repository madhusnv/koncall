package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import vx.C7806h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c4 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ int f6095a = 1;

    /* renamed from: b */
    public final /* synthetic */ Object f6096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(g4 g4Var) {
        super(null);
        this.f6096b = g4Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z6) {
        switch (this.f6095a) {
            case 0:
                ((AtomicBoolean) ((p013o.i2) this.f6096b).f25538a).set(true);
                return;
            case 1:
                g4 g4Var = (g4) this.f6096b;
                synchronized (g4Var.f6210f) {
                    g4Var.f6211g = null;
                    g4Var.f6207c.run();
                }
                synchronized (g4Var) {
                    try {
                        Iterator it = g4Var.f6212h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                super.onChange(z6);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(p013o.i2 i2Var) {
        super(null);
        Objects.requireNonNull(i2Var);
        this.f6096b = i2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(C7806h c7806h, Handler handler) {
        super(handler);
        this.f6096b = c7806h;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z6, Uri uri) {
        switch (this.f6095a) {
            case 2:
                ((C7806h) this.f6096b).mo14776i(qw.a0.f30746a);
                break;
            default:
                super.onChange(z6, uri);
                break;
        }
    }
}
