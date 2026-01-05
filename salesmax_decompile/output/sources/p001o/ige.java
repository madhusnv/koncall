package p001o;

import p001o.hha;

/* loaded from: classes3.dex */
public interface ige {
    long getAccessTime();

    int getHash();

    Object getKey();

    ige getNext();

    ige getNextInAccessQueue();

    ige getNextInWriteQueue();

    ige getPreviousInAccessQueue();

    ige getPreviousInWriteQueue();

    hha.b0 getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(ige igeVar);

    void setNextInWriteQueue(ige igeVar);

    void setPreviousInAccessQueue(ige igeVar);

    void setPreviousInWriteQueue(ige igeVar);

    void setValueReference(hha.b0 b0Var);

    void setWriteTime(long j);
}
