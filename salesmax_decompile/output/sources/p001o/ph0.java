package p001o;

import javax.annotation.processing.AbstractProcessor;

/* loaded from: classes6.dex */
public class ph0 extends AbstractProcessor {

    /* renamed from: a */
    public final AbstractProcessor f40055a = m43639a();

    /* renamed from: a */
    public static AbstractProcessor m43639a() {
        try {
            return (AbstractProcessor) kna.m35948a().loadClass("lombok.core.AnnotationProcessor").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new RuntimeException(th);
        }
    }
}
