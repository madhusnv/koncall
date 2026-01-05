package p001o;

import java.security.PrivilegedAction;

/* loaded from: classes6.dex */
public final class qia implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public Object run() {
        tia.f47197c = System.getProperty("org.mortbay.log.class", "org.mortbay.log.Slf4jLog");
        tia.f47198d = System.getProperty("VERBOSE", null) != null;
        tia.f47199e = System.getProperty("IGNORED", null) != null;
        return new Boolean(true);
    }
}
