package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import cg.BinderC0969b;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import dg.C1716e;
import java.util.Objects;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 extends h1 {

    /* renamed from: e */
    public final /* synthetic */ int f6050e = 3;

    /* renamed from: f */
    public final /* synthetic */ Object f6051f;

    /* renamed from: g */
    public final /* synthetic */ Object f6052g;

    /* renamed from: h */
    public final /* synthetic */ Object f6053h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1 k1Var, Activity activity, i0 i0Var) {
        super(k1Var.f6263a, true);
        this.f6052g = activity;
        this.f6053h = i0Var;
        this.f6051f = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: a */
    public final void mo3100a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f6050e) {
            case 0:
                try {
                    Context context = (Context) this.f6052g;
                    AbstractC6840z.m13036g(context);
                    String strM14263a = ug.z1.m14263a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strM14263a)) {
                        strM14263a = ug.z1.m14263a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strM14263a);
                    l0 l0VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                    l1 l1Var = (l1) this.f6051f;
                    boolean z6 = boolValueOf == null || !boolValueOf.booleanValue();
                    l1Var.getClass();
                    try {
                        l0VarAsInterface = k0.asInterface(C1716e.m5404c(context, z6 ? C1716e.f8345d : C1716e.f8344c, ModuleDescriptor.MODULE_ID).m5410b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule$LoadingException e2) {
                        l1Var.m3483d(e2, true, false);
                    }
                    l1Var.f6281f = l0VarAsInterface;
                    if (l1Var.f6281f != null) {
                        int iM5403a = C1716e.m5403a(context, ModuleDescriptor.MODULE_ID);
                        u0 u0Var = new u0(133005L, Math.max(iM5403a, r6), Boolean.TRUE.equals(boolValueOf) || C1716e.m5405d(context, ModuleDescriptor.MODULE_ID, false) < iM5403a, (Bundle) this.f6053h, ug.z1.m14263a(context));
                        l0 l0Var = l1Var.f6281f;
                        AbstractC6840z.m13036g(l0Var);
                        l0Var.initialize(new BinderC0969b(context), u0Var, this.f6225a);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e10) {
                    ((l1) this.f6051f).m3483d(e10, true, false);
                    return;
                }
                break;
            case 1:
                l0 l0Var2 = ((l1) this.f6051f).f6281f;
                AbstractC6840z.m13036g(l0Var2);
                l0Var2.getMaxUserProperties((String) this.f6052g, (i0) this.f6053h);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.f6053h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                l0 l0Var3 = ((k1) this.f6051f).f6263a.f6281f;
                AbstractC6840z.m13036g(l0Var3);
                l0Var3.onActivityCreatedByScionActivityInfo(w0.m3730b((Activity) this.f6052g), bundle, this.f6226b);
                break;
            default:
                l0 l0Var4 = ((k1) this.f6051f).f6263a.f6281f;
                AbstractC6840z.m13036g(l0Var4);
                l0Var4.onActivitySaveInstanceStateByScionActivityInfo(w0.m3730b((Activity) this.f6052g), (i0) this.f6053h, this.f6226b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: b */
    public void mo3101b() {
        switch (this.f6050e) {
            case 1:
                ((i0) this.f6053h).mo3311E(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1 k1Var, Bundle bundle, Activity activity) {
        super(k1Var.f6263a, true);
        this.f6053h = bundle;
        this.f6052g = activity;
        this.f6051f = k1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(l1 l1Var, Context context, Bundle bundle) {
        super(l1Var, true);
        this.f6052g = context;
        this.f6053h = bundle;
        this.f6051f = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(l1 l1Var, String str, i0 i0Var) {
        super(l1Var, true);
        this.f6052g = str;
        this.f6053h = i0Var;
        Objects.requireNonNull(l1Var);
        this.f6051f = l1Var;
    }
}
