package fh;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import l0.AbstractC4308h;
import l0.C4311k;
import og.y0;
import w8.C7957h;
import x4.C8299i;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fh.a */
/* loaded from: classes.dex */
public final class RunnableC2286a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10317a;

    /* renamed from: b */
    public final int f10318b;

    /* renamed from: c */
    public final Object f10319c;

    /* renamed from: d */
    public final Object f10320d;

    public /* synthetic */ RunnableC2286a(Object obj, Object obj2, int i10, int i11) {
        this.f10317a = i11;
        this.f10319c = obj;
        this.f10320d = obj2;
        this.f10318b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        C8299i c8299i;
        ArrayList arrayList;
        int iDecrementAndGet;
        switch (this.f10317a) {
            case 0:
                ((BottomSheetBehavior) this.f10320d).m4050A(this.f10318b, (View) this.f10319c);
                return;
            case 1:
                C4311k c4311k = (C4311k) this.f10320d;
                int i10 = this.f10318b;
                InterfaceFutureC8957d interfaceFutureC8957d = (InterfaceFutureC8957d) this.f10319c;
                boolean z6 = c4311k.f21741c;
                AtomicInteger atomicInteger = c4311k.f21742d;
                ArrayList arrayList2 = c4311k.f21740b;
                if (c4311k.isDone() || arrayList2 == null) {
                    y0.m11056f("Future was done before all dependencies completed", z6);
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                y0.m11056f("Tried to set value from future which is not done", interfaceFutureC8957d.isDone());
                                arrayList2.set(i10, AbstractC4308h.m9032b(interfaceFutureC8957d));
                                iDecrementAndGet = atomicInteger.decrementAndGet();
                                y0.m11056f("Less than 0 remaining futures", iDecrementAndGet >= 0);
                            } catch (Error e2) {
                                c4311k.f21744f.m15509d(e2);
                                int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                y0.m11056f("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                                if (iDecrementAndGet2 != 0) {
                                    return;
                                }
                                ArrayList arrayList3 = c4311k.f21740b;
                                if (arrayList3 != null) {
                                    c8299i = c4311k.f21744f;
                                    arrayList = new ArrayList(arrayList3);
                                }
                            }
                        } catch (RuntimeException e10) {
                            if (z6) {
                                c4311k.f21744f.m15509d(e10);
                            }
                            int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                            y0.m11056f("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                            if (iDecrementAndGet3 != 0) {
                                return;
                            }
                            ArrayList arrayList4 = c4311k.f21740b;
                            if (arrayList4 != null) {
                                c8299i = c4311k.f21744f;
                                arrayList = new ArrayList(arrayList4);
                            }
                        }
                    } catch (CancellationException unused) {
                        if (z6) {
                            c4311k.cancel(false);
                        }
                        int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                        y0.m11056f("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                        if (iDecrementAndGet4 != 0) {
                            return;
                        }
                        ArrayList arrayList5 = c4311k.f21740b;
                        if (arrayList5 != null) {
                            c8299i = c4311k.f21744f;
                            arrayList = new ArrayList(arrayList5);
                        }
                    } catch (ExecutionException e11) {
                        if (z6) {
                            c4311k.f21744f.m15509d(e11.getCause());
                        }
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        y0.m11056f("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                        if (iDecrementAndGet5 != 0) {
                            return;
                        }
                        ArrayList arrayList6 = c4311k.f21740b;
                        if (arrayList6 != null) {
                            c8299i = c4311k.f21744f;
                            arrayList = new ArrayList(arrayList6);
                        }
                    }
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList7 = c4311k.f21740b;
                        if (arrayList7 != null) {
                            c8299i = c4311k.f21744f;
                            arrayList = new ArrayList(arrayList7);
                            c8299i.m15507b(arrayList);
                            return;
                        }
                        y0.m11056f(null, c4311k.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    y0.m11056f("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList8 = c4311k.f21740b;
                        if (arrayList8 != null) {
                            c4311k.f21744f.m15507b(new ArrayList(arrayList8));
                        } else {
                            y0.m11056f(null, c4311k.isDone());
                        }
                    }
                    throw th2;
                }
            case 2:
                ((TextView) this.f10319c).setTypeface((Typeface) this.f10320d, this.f10318b);
                return;
            default:
                ((C7957h) this.f10319c).m15136b((Intent) this.f10320d, this.f10318b);
                return;
        }
    }

    public RunnableC2286a(C4311k c4311k, int i10, InterfaceFutureC8957d interfaceFutureC8957d) {
        this.f10317a = 1;
        this.f10320d = c4311k;
        this.f10318b = i10;
        this.f10319c = interfaceFutureC8957d;
    }

    public RunnableC2286a(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f10317a = 0;
        this.f10320d = bottomSheetBehavior;
        this.f10319c = view;
        this.f10318b = i10;
    }
}
