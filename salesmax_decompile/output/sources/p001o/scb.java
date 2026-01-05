package p001o;

/* loaded from: classes6.dex */
public interface scb extends tcb {

    /* renamed from: o.scb$a */
    public interface InterfaceC16809a extends tcb, Cloneable {
        scb build();

        scb buildPartial();

        InterfaceC16809a mergeFrom(scb scbVar);
    }

    int getSerializedSize();

    InterfaceC16809a newBuilderForType();

    InterfaceC16809a toBuilder();

    void writeTo(nf3 nf3Var);
}
