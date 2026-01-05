package d9;

import androidx.work.impl.WorkDatabase;
import com.skydoves.balloon.C1428e;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import u8.AbstractC7360h;
import u8.C7368p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.c */
/* loaded from: classes.dex */
public final class C1658c extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f8170a = 0;

    /* renamed from: b */
    public final /* synthetic */ C7368p f8171b;

    /* renamed from: c */
    public final /* synthetic */ String f8172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1658c(String str, C7368p c7368p) {
        super(0);
        this.f8172c = str;
        this.f8171b = c7368p;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f8170a) {
            case 0:
                String name = this.f8172c;
                AbstractC4154l.m8923f(name, "name");
                C7368p c7368p = this.f8171b;
                WorkDatabase workDatabase = c7368p.f35045c;
                AbstractC4154l.m8922e(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.m16398u(new C1428e(new RunnableC1657b(workDatabase, name, c7368p, 0), 1));
                AbstractC7360h.m13779b(c7368p.f35044b, workDatabase, c7368p.f35047e);
                break;
            default:
                C7368p c7368p2 = this.f8171b;
                WorkDatabase workDatabase2 = c7368p2.f35045c;
                AbstractC4154l.m8922e(workDatabase2, "workManagerImpl.workDatabase");
                workDatabase2.m16398u(new C1428e(new RunnableC1657b(workDatabase2, this.f8172c, c7368p2, 1), 1));
                AbstractC7360h.m13779b(c7368p2.f35044b, workDatabase2, c7368p2.f35047e);
                break;
        }
        return a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1658c(C7368p c7368p, String str) {
        super(0);
        this.f8171b = c7368p;
        this.f8172c = str;
    }
}
