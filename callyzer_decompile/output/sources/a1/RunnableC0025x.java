package a1;

import a6.C0058f;
import ak.C0168g;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.C0340e;
import androidx.fragment.app.C0349n;
import androidx.fragment.app.a2;
import androidx.fragment.app.h2;
import androidx.fragment.app.j0;
import androidx.fragment.app.v1;
import bk.C0676g;
import c0.x1;
import c9.C0910e;
import c9.C0915j;
import c9.C0927v;
import com.amplifyframework.hub.AWSHubPlugin;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonPlacement;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import d7.g0;
import d7.h0;
import ex.InterfaceC2137a;
import i0.AbstractC3084o;
import i0.C3070a;
import i0.g1;
import i00.C3107l;
import i00.InterfaceC3102g;
import i00.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4367l;
import ni.C5074c;
import ni.InterfaceC5073b;
import og.ja;
import og.u1;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONObject;
import p020v.C7597g;
import p020v.C7599i;
import p021w.C7839e;
import q0.C6062c;
import q0.C6069j;
import qj.InterfaceC6237b;
import r0.C6414e;
import t8.C7077w;
import u8.C7356d;
import u8.C7361i;
import u8.C7378z;
import u8.InterfaceC7354b;
import wj.AbstractServiceC8081g;
import x4.C8299i;
import x4.C8302l;
import yg.C8650g;
import z1.C8849i;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.x */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0025x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f96a;

    /* renamed from: b */
    public final /* synthetic */ Object f97b;

    /* renamed from: c */
    public final /* synthetic */ Object f98c;

    /* renamed from: d */
    public final /* synthetic */ Object f99d;

    public /* synthetic */ RunnableC0025x(int i10, Object obj, Object obj2, Object obj3) {
        this.f96a = i10;
        this.f97b = obj;
        this.f98c = obj2;
        this.f99d = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v50, types: [ex.a, kotlin.jvm.internal.m] */
    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObjectOptJSONObject;
        d7.d0 d0VarMo7320b;
        int i10 = 0;
        boolean zBooleanValue = true;
        Object obj = null;
        switch (this.f96a) {
            case 0:
                b0 b0Var = (b0) this.f97b;
                x1 x1Var = (x1) this.f98c;
                C0013l c0013l = (C0013l) this.f99d;
                a0 a0Var = b0Var.f17f;
                a0Var.m6a();
                if (a0Var.f13g) {
                    a0Var.f13g = false;
                    x1Var.m2238c();
                    x1Var.f5266i.m15507b(null);
                    return;
                }
                a0Var.f8b = x1Var;
                a0Var.f10d = c0013l;
                Size size = x1Var.f5259b;
                a0Var.f7a = size;
                a0Var.f12f = false;
                if (a0Var.m7b()) {
                    return;
                }
                u1.m10942a("SurfaceViewImpl");
                a0Var.f14h.f16e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                return;
            case 1:
                ViewGroup container = (ViewGroup) this.f97b;
                View view = (View) this.f98c;
                C0340e this$0 = (C0340e) this.f99d;
                AbstractC4154l.m8923f(container, "$container");
                AbstractC4154l.m8923f(this$0, "this$0");
                container.endViewTransition(view);
                this$0.f2497c.f2605a.m1139c(this$0);
                return;
            case 2:
                h2 h2Var = (h2) this.f97b;
                h2 h2Var2 = (h2) this.f98c;
                C0349n c0349n = (C0349n) this.f99d;
                j0 inFragment = h2Var.f2547c;
                j0 outFragment = h2Var2.f2547c;
                boolean z6 = c0349n.f2641o;
                a2 a2Var = v1.f2724a;
                AbstractC4154l.m8923f(inFragment, "inFragment");
                AbstractC4154l.m8923f(outFragment, "outFragment");
                if (z6) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 3:
                C0168g c0168g = (C0168g) this.f97b;
                String str = (String) this.f98c;
                C0676g c0676g = (C0676g) this.f99d;
                C0910e c0910e = c0168g.f518a;
                InterfaceC5073b interfaceC5073b = (InterfaceC5073b) ((InterfaceC6237b) c0910e.f5579b).get();
                if (interfaceC5073b == null) {
                    return;
                }
                JSONObject jSONObject = c0676g.f4261e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = c0676g.f4258b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) c0910e.f5580c)) {
                        try {
                            if (!strOptString.equals(((Map) c0910e.f5580c).get(str))) {
                                ((Map) c0910e.f5580c).put(str, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                C5074c c5074c = (C5074c) interfaceC5073b;
                                c5074c.m10007a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                c5074c.m10007a("fp", "_fpc", bundle2);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 4:
                ((AWSHubPlugin) this.f97b).lambda$publish$1((HubChannel) this.f98c, (HubEvent) this.f99d);
                return;
            case 5:
                TransferStatusUpdater.updateTransferState$lambda$9$lambda$8$lambda$7((TransferRecord) this.f97b, (TransferListener) this.f98c, (TransferState) this.f99d);
                return;
            case 6:
                Balloon.initializeArrow$lambda$7$lambda$6((Balloon) this.f97b, (View) this.f98c, (ImageView) this.f99d);
                return;
            case 7:
                Balloon.show$lambda$34((Balloon) this.f97b, (View) this.f98c, (BalloonPlacement) this.f99d);
                return;
            case 8:
                PhoneStateReceiver.m4591a((Context) this.f97b, (Intent) this.f98c, (PhoneStateReceiver) this.f99d);
                return;
            case 9:
                Throwable th2 = (Throwable) this.f97b;
                C3070a c3070a = (C3070a) this.f98c;
                List list = (List) this.f99d;
                if (th2 != null) {
                    c3070a.f16422b.onError(th2);
                    return;
                } else {
                    c3070a.f16422b.mo88q(list);
                    return;
                }
            case 10:
                ArrayList arrayList = (ArrayList) this.f97b;
                h0 h0Var = (h0) this.f98c;
                String str2 = (String) this.f99d;
                try {
                    int size2 = arrayList.size();
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            if (AbstractC4154l.m8918a(((i0.e0) obj2).mo7323e(), str2)) {
                                obj = obj2;
                            }
                        }
                    }
                    i0.e0 e0Var = (i0.e0) obj;
                    if (e0Var == null || (d0VarMo7320b = e0Var.mo7320b()) == null) {
                        return;
                    }
                    d0VarMo7320b.mo5320j(h0Var);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 11:
                C0927v c0927v = (C0927v) this.f97b;
                g1 g1Var = (g1) this.f98c;
                g1 g1Var2 = (g1) this.f99d;
                g0 g0Var = (g0) c0927v.f5668b;
                if (g1Var != null) {
                    g0Var.mo5320j(g1Var);
                }
                g0Var.m5316f(g1Var2);
                return;
            case 12:
                C8849i c8849i = (C8849i) this.f97b;
                InterfaceC3102g interfaceC3102g = (InterfaceC3102g) this.f98c;
                p0 p0Var = (p0) this.f99d;
                C3107l c3107l = (C3107l) c8849i.f42584c;
                if (c3107l.f16670b.mo7441h()) {
                    interfaceC3102g.mo5819L(c3107l, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC3102g.mo5818A(c3107l, p0Var);
                    return;
                }
            case 13:
                ((InterfaceC3102g) this.f98c).mo5819L((C3107l) ((C8849i) this.f97b).f42584c, (Throwable) this.f99d);
                return;
            case 14:
                C6062c c6062c = (C6062c) this.f97b;
                Runnable runnable = (Runnable) this.f98c;
                Runnable runnable2 = (Runnable) this.f99d;
                if (c6062c.f29573j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C6062c c6062c2 = (C6062c) this.f97b;
                c0.a0 a0Var2 = (c0.a0) this.f98c;
                Map map = Collections.EMPTY_MAP;
                C8299i c8299i = (C8299i) this.f99d;
                try {
                    c6062c2.f29564a.mo6818h(a0Var2);
                    c8299i.m15507b(null);
                    return;
                } catch (RuntimeException e2) {
                    c8299i.m15509d(e2);
                    return;
                }
            case 16:
                ((C4367l) this.f97b).m9131e((C6069j) this.f98c, (Map.Entry) this.f99d);
                return;
            case 17:
                C6414e c6414e = (C6414e) this.f97b;
                c0.a0 a0Var3 = (c0.a0) this.f98c;
                Map map2 = Collections.EMPTY_MAP;
                C8299i c8299i2 = (C8299i) this.f99d;
                try {
                    c6414e.f30931a.mo6818h(a0Var3);
                    c8299i2.m15507b(null);
                    return;
                } catch (RuntimeException e10) {
                    c8299i2.m15509d(e10);
                    return;
                }
            case 18:
                C6414e c6414e2 = (C6414e) this.f97b;
                Runnable runnable3 = (Runnable) this.f98c;
                Runnable runnable4 = (Runnable) this.f99d;
                if (c6414e2.f30936f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 19:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f97b;
                C8299i c8299i3 = (C8299i) this.f98c;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f99d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    c8299i3.m15507b(interfaceC2137a.invoke());
                    return;
                } catch (Throwable th3) {
                    c8299i3.m15509d(th3);
                    return;
                }
            case 20:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f97b;
                C8299i c8299i4 = (C8299i) this.f98c;
                ?? r22 = (AbstractC4155m) this.f99d;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    c8299i4.m15507b(r22.invoke());
                    return;
                } catch (Throwable th4) {
                    c8299i4.m15509d(th4);
                    return;
                }
            case 21:
                C7356d c7356d = (C7356d) this.f97b;
                C8302l c8302l = (C8302l) this.f98c;
                C7378z c7378z = (C7378z) this.f99d;
                try {
                    zBooleanValue = ((Boolean) c8302l.f39850b.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                synchronized (c7356d.f35013k) {
                    try {
                        C0915j c0915jM10706a = ja.m10706a(c7378z.f35066a);
                        String str3 = c0915jM10706a.f5589a;
                        if (c7356d.m13771c(str3) == c7378z) {
                            c7356d.m13770b(str3);
                        }
                        C7077w.m13371a().getClass();
                        ArrayList arrayList2 = c7356d.f35012j;
                        int size3 = arrayList2.size();
                        while (i10 < size3) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            ((InterfaceC7354b) obj3).mo1381a(c0915jM10706a, zBooleanValue);
                        }
                    } finally {
                    }
                }
                return;
            case 22:
                ((C7356d) ((C8849i) this.f97b).f42583b).m13774g((C7361i) this.f98c, (C4367l) this.f99d);
                return;
            case 23:
                C7599i c7599i = (C7599i) this.f97b;
                Executor executor = (Executor) this.f98c;
                AbstractC3084o abstractC3084o = (AbstractC3084o) this.f99d;
                C0006e c0006e = c7599i.f36593y;
                ((HashSet) c0006e.f33b).add(abstractC3084o);
                ((ArrayMap) c0006e.f34c).put(abstractC3084o, executor);
                return;
            case 24:
                ((C7839e) this.f97b).f37604a.onSurfacePrepared((CameraCaptureSession) this.f98c, (Surface) this.f99d);
                return;
            case 25:
                AbstractServiceC8081g abstractServiceC8081g = (AbstractServiceC8081g) this.f97b;
                Intent intent = (Intent) this.f98c;
                C8650g c8650g = (C8650g) this.f99d;
                try {
                    abstractServiceC8081g.mo4487c(intent);
                    return;
                } finally {
                    c8650g.m15969b(null);
                }
            default:
                C0058f c0058f = (C0058f) this.f97b;
                C7597g c7597g = (C7597g) this.f98c;
                InterfaceFutureC8957d interfaceFutureC8957d = (InterfaceFutureC8957d) this.f99d;
                c0058f.getClass();
                Objects.toString(c7597g);
                ((List) c0058f.f234b).remove(interfaceFutureC8957d);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC0025x(AtomicBoolean atomicBoolean, C8299i c8299i, InterfaceC2137a interfaceC2137a) {
        this.f96a = 20;
        this.f97b = atomicBoolean;
        this.f98c = c8299i;
        this.f99d = (AbstractC4155m) interfaceC2137a;
    }

    public /* synthetic */ RunnableC0025x(C6062c c6062c, c0.a0 a0Var, C8299i c8299i) {
        this.f96a = 15;
        Map map = Collections.EMPTY_MAP;
        this.f97b = c6062c;
        this.f98c = a0Var;
        this.f99d = c8299i;
    }

    public /* synthetic */ RunnableC0025x(C6414e c6414e, c0.a0 a0Var, C8299i c8299i) {
        this.f96a = 17;
        Map map = Collections.EMPTY_MAP;
        this.f97b = c6414e;
        this.f98c = a0Var;
        this.f99d = c8299i;
    }
}
