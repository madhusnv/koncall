package z8;

import a9.AbstractC0067f;
import a9.C0062a;
import android.os.Build;
import c9.C0922q;
import kotlin.jvm.internal.AbstractC4154l;
import t8.EnumC7078x;
import y8.C8596e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z8.d */
/* loaded from: classes.dex */
public final class C8901d extends AbstractC8900c {

    /* renamed from: b */
    public final /* synthetic */ int f42863b;

    /* renamed from: c */
    public final int f42864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8901d(AbstractC0067f tracker, int i10) {
        super(tracker);
        this.f42863b = i10;
        switch (i10) {
            case 2:
                AbstractC4154l.m8923f(tracker, "tracker");
                super(tracker);
                this.f42864c = 7;
                break;
            case 3:
                AbstractC4154l.m8923f(tracker, "tracker");
                super(tracker);
                this.f42864c = 7;
                break;
            case 4:
                AbstractC4154l.m8923f(tracker, "tracker");
                super(tracker);
                this.f42864c = 9;
                break;
            default:
                AbstractC4154l.m8923f(tracker, "tracker");
                this.f42864c = 6;
                break;
        }
    }

    @Override // z8.InterfaceC8902e
    /* renamed from: a */
    public final boolean mo15950a(C0922q workSpec) {
        switch (this.f42863b) {
            case 0:
                AbstractC4154l.m8923f(workSpec, "workSpec");
                return workSpec.f5631j.f34131c;
            case 1:
                AbstractC4154l.m8923f(workSpec, "workSpec");
                return workSpec.f5631j.f34133e;
            case 2:
                AbstractC4154l.m8923f(workSpec, "workSpec");
                return workSpec.f5631j.f34129a == EnumC7078x.CONNECTED;
            case 3:
                AbstractC4154l.m8923f(workSpec, "workSpec");
                EnumC7078x enumC7078x = workSpec.f5631j.f34129a;
                return enumC7078x == EnumC7078x.UNMETERED || (Build.VERSION.SDK_INT >= 30 && enumC7078x == EnumC7078x.TEMPORARILY_UNMETERED);
            default:
                AbstractC4154l.m8923f(workSpec, "workSpec");
                return workSpec.f5631j.f34134f;
        }
    }

    @Override // z8.AbstractC8900c
    /* renamed from: d */
    public final int mo16404d() {
        switch (this.f42863b) {
        }
        return this.f42864c;
    }

    @Override // z8.AbstractC8900c
    /* renamed from: e */
    public final boolean mo16405e(Object obj) {
        boolean zBooleanValue;
        switch (this.f42863b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                C8596e value = (C8596e) obj;
                AbstractC4154l.m8923f(value, "value");
                boolean z6 = value.f41842a;
                return Build.VERSION.SDK_INT < 26 ? !z6 : !(z6 && value.f41843b);
            case 3:
                C8596e value2 = (C8596e) obj;
                AbstractC4154l.m8923f(value2, "value");
                return !value2.f41842a || value2.f41844c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8901d(C0062a tracker) {
        super(tracker);
        this.f42863b = 1;
        AbstractC4154l.m8923f(tracker, "tracker");
        this.f42864c = 5;
    }
}
