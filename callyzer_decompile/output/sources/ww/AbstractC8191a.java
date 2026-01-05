package ww;

import com.sun.mail.imap.IMAPStore;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import qw.a0;
import ug.C7439j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ww.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8191a implements InterfaceC7559c, InterfaceC8194d, Serializable {
    private final InterfaceC7559c<Object> completion;

    public AbstractC8191a(InterfaceC7559c interfaceC7559c) {
        this.completion = interfaceC7559c;
    }

    public InterfaceC7559c<a0> create(InterfaceC7559c<?> completion) {
        AbstractC4154l.m8923f(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // ww.InterfaceC8194d
    public InterfaceC8194d getCallerFrame() {
        InterfaceC7559c<Object> interfaceC7559c = this.completion;
        if (interfaceC7559c instanceof InterfaceC8194d) {
            return (InterfaceC8194d) interfaceC7559c;
        }
        return null;
    }

    public final InterfaceC7559c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strM15343c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC8195e interfaceC8195e = (InterfaceC8195e) getClass().getAnnotation(InterfaceC8195e.class);
        String str = null;
        if (interfaceC8195e == null || interfaceC8195e.m15347v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? interfaceC8195e.m15345l()[iIntValue] : -1;
        C7439j c7439j = AbstractC8196f.f39161b;
        C7439j c7439j2 = AbstractC8196f.f39160a;
        if (c7439j == null) {
            try {
                C7439j c7439j3 = new C7439j(13, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(IMAPStore.ID_NAME, null));
                AbstractC8196f.f39161b = c7439j3;
                c7439j = c7439j3;
            } catch (Exception unused2) {
                AbstractC8196f.f39161b = c7439j2;
                c7439j = c7439j2;
            }
        }
        if (c7439j != c7439j2 && (method = (Method) c7439j.f35537b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c7439j.f35538c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c7439j.f35539d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM15343c = interfaceC8195e.m15343c();
        } else {
            strM15343c = str + '/' + interfaceC8195e.m15343c();
        }
        return new StackTraceElement(strM15343c, interfaceC8195e.m15346m(), interfaceC8195e.m15344f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) {
        InterfaceC7559c interfaceC7559c = this;
        while (true) {
            AbstractC8191a abstractC8191a = (AbstractC8191a) interfaceC7559c;
            InterfaceC7559c interfaceC7559c2 = abstractC8191a.completion;
            AbstractC4154l.m8920c(interfaceC7559c2);
            try {
                obj = abstractC8191a.invokeSuspend(obj);
                if (obj == EnumC7794a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th2) {
                obj = od.m10796a(th2);
            }
            abstractC8191a.releaseIntercepted();
            if (!(interfaceC7559c2 instanceof AbstractC8191a)) {
                interfaceC7559c2.resumeWith(obj);
                return;
            }
            interfaceC7559c = interfaceC7559c2;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> completion) {
        AbstractC4154l.m8923f(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
