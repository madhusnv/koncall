package rn;

import com.amplifyframework.kotlin.auth.Auth;
import com.amplifyframework.kotlin.auth.KotlinAuthFacade;
import com.amplifyframework.kotlin.core.Amplify;
import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.r */
/* loaded from: classes3.dex */
public final class C6589r extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f31643a;

    public C6589r() {
        super(2, null);
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C6589r(2, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6589r) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f31643a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        KotlinAuthFacade auth = Amplify.Companion.getAuth();
        this.f31643a = 1;
        Object objFetchAuthSession$default = Auth.fetchAuthSession$default(auth, null, this, 1, null);
        return objFetchAuthSession$default == enumC7794a ? enumC7794a : objFetchAuthSession$default;
    }
}
