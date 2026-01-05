package ps;

import ex.InterfaceC2137a;
import ss.C6920i;
import ss.C6923l;
import ss.C6930s;
import ss.z0;
import ts.EnumC7215b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6010j implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f29383a;

    /* renamed from: b */
    public final /* synthetic */ z0 f29384b;

    public /* synthetic */ C6010j(z0 z0Var, int i10) {
        this.f29383a = i10;
        this.f29384b = z0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f29383a) {
            case 0:
                this.f29384b.m13196s(new C6923l(EnumC7215b.Error));
                break;
            case 1:
                this.f29384b.m13196s(new C6923l(EnumC7215b.InitialFolderSelect));
                break;
            case 2:
                this.f29384b.m13196s(new C6923l(EnumC7215b.FolderSelectInSettings));
                break;
            case 3:
                this.f29384b.m13196s(new C6923l(EnumC7215b.FolderSelectInSettings));
                break;
            case 4:
                this.f29384b.m13196s(new C6923l(EnumC7215b.NeedStoragePermission));
                break;
            case 5:
                this.f29384b.m13196s(C6920i.f33443a);
                break;
            case 6:
                this.f29384b.m13196s(new C6923l(EnumC7215b.AutoStartPermission));
                break;
            case 7:
                this.f29384b.m13196s(new C6923l(EnumC7215b.AppUpdated));
                break;
            case 8:
                this.f29384b.m13196s(new C6923l(EnumC7215b.Error));
                break;
            case 9:
                this.f29384b.m13196s(C6930s.f33484a);
                break;
            default:
                this.f29384b.m13196s(C6930s.f33484a);
                break;
        }
        return qw.a0.f30746a;
    }
}
