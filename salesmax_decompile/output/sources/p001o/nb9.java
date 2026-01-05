package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface nb9 extends mb9 {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    ec9 getReturnType();

    List getTypeParameters();

    fc9 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
