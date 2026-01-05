package jakarta.mail;

import jakarta.mail.event.C3638a;
import jakarta.mail.event.InterfaceC3647j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class f0 extends AbstractC3695w {
    private volatile Vector<InterfaceC3647j> transportListeners;

    public f0(c0 c0Var, h0 h0Var) {
        super(c0Var, h0Var);
        this.transportListeners = null;
    }

    /* renamed from: h */
    public static void m8194h(AbstractC3682n abstractC3682n, AbstractC3633a[] abstractC3633aArr, String str, String str2) throws NoSuchProviderException, SendFailedException {
        AbstractC3633a[] abstractC3633aArr2;
        AbstractC3633a[] abstractC3633aArr3;
        f0 f0VarM8185h;
        if (abstractC3633aArr == null || abstractC3633aArr.length == 0) {
            throw new SendFailedException("No recipient addresses");
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < abstractC3633aArr.length; i10++) {
            if (map.containsKey(abstractC3633aArr[i10].getType())) {
                ((List) map.get(abstractC3633aArr[i10].getType())).add(abstractC3633aArr[i10]);
            } else {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(abstractC3633aArr[i10]);
                map.put(abstractC3633aArr[i10].getType(), arrayList4);
            }
        }
        int size = map.size();
        if (size == 0) {
            throw new SendFailedException("No recipient addresses");
        }
        c0 c0VarM8177d = abstractC3682n.session;
        if (c0VarM8177d == null) {
            c0VarM8177d = c0.m8177d(System.getProperties());
        }
        if (size == 1) {
            f0VarM8185h = c0VarM8177d.m8185h(abstractC3633aArr[0]);
            try {
                if (str != null) {
                    f0VarM8185h.connect(str, str2);
                } else {
                    f0VarM8185h.connect();
                }
                f0VarM8185h.sendMessage(abstractC3682n, abstractC3633aArr);
                return;
            } finally {
            }
        }
        AbstractC3633a[] abstractC3633aArr4 = null;
        MessagingException messagingException = null;
        boolean z6 = false;
        for (List list : map.values()) {
            int size2 = list.size();
            AbstractC3633a[] abstractC3633aArr5 = new AbstractC3633a[size2];
            list.toArray(abstractC3633aArr5);
            f0VarM8185h = c0VarM8177d.m8185h(abstractC3633aArr5[0]);
            if (f0VarM8185h == null) {
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList.add(abstractC3633aArr5[i11]);
                }
            } else {
                try {
                    try {
                        f0VarM8185h.connect();
                        f0VarM8185h.sendMessage(abstractC3682n, abstractC3633aArr5);
                    } finally {
                        f0VarM8185h.close();
                    }
                } catch (SendFailedException e2) {
                    if (messagingException == null) {
                        messagingException = e2;
                    } else {
                        messagingException.setNextException(e2);
                    }
                    AbstractC3633a[] invalidAddresses = e2.getInvalidAddresses();
                    if (invalidAddresses != null) {
                        for (AbstractC3633a abstractC3633a : invalidAddresses) {
                            arrayList.add(abstractC3633a);
                        }
                    }
                    AbstractC3633a[] validSentAddresses = e2.getValidSentAddresses();
                    if (validSentAddresses != null) {
                        for (AbstractC3633a abstractC3633a2 : validSentAddresses) {
                            arrayList2.add(abstractC3633a2);
                        }
                    }
                    AbstractC3633a[] validUnsentAddresses = e2.getValidUnsentAddresses();
                    if (validUnsentAddresses != null) {
                        for (AbstractC3633a abstractC3633a3 : validUnsentAddresses) {
                            arrayList3.add(abstractC3633a3);
                        }
                    }
                    f0VarM8185h.close();
                    z6 = true;
                } catch (MessagingException e10) {
                    if (messagingException == null) {
                        messagingException = e10;
                    } else {
                        messagingException.setNextException(e10);
                    }
                    f0VarM8185h.close();
                    z6 = true;
                }
            }
        }
        if (!z6 && arrayList.size() == 0 && arrayList3.size() == 0) {
            return;
        }
        if (arrayList2.size() > 0) {
            AbstractC3633a[] abstractC3633aArr6 = new AbstractC3633a[arrayList2.size()];
            arrayList2.toArray(abstractC3633aArr6);
            abstractC3633aArr2 = abstractC3633aArr6;
        } else {
            abstractC3633aArr2 = null;
        }
        if (arrayList3.size() > 0) {
            AbstractC3633a[] abstractC3633aArr7 = new AbstractC3633a[arrayList3.size()];
            arrayList3.toArray(abstractC3633aArr7);
            abstractC3633aArr3 = abstractC3633aArr7;
        } else {
            abstractC3633aArr3 = null;
        }
        if (arrayList.size() > 0) {
            abstractC3633aArr4 = new AbstractC3633a[arrayList.size()];
            arrayList.toArray(abstractC3633aArr4);
        }
        throw new SendFailedException("Sending failed", messagingException, abstractC3633aArr2, abstractC3633aArr3, abstractC3633aArr4);
    }

    public static void send(AbstractC3682n abstractC3682n) throws NoSuchProviderException, SendFailedException {
        abstractC3682n.saveChanges();
        m8194h(abstractC3682n, abstractC3682n.getAllRecipients(), null, null);
    }

    public synchronized void addTransportListener(InterfaceC3647j interfaceC3647j) {
        try {
            if (this.transportListeners == null) {
                this.transportListeners = new Vector<>();
            }
            this.transportListeners.addElement(interfaceC3647j);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void notifyTransportListeners(int i10, AbstractC3633a[] abstractC3633aArr, AbstractC3633a[] abstractC3633aArr2, AbstractC3633a[] abstractC3633aArr3, AbstractC3682n abstractC3682n) {
        if (this.transportListeners == null) {
            return;
        }
        C3638a c3638a = new C3638a(this);
        c3638a.f19301b = i10;
        queueEvent(c3638a, this.transportListeners);
    }

    public synchronized void removeTransportListener(InterfaceC3647j interfaceC3647j) {
        if (this.transportListeners != null) {
            this.transportListeners.removeElement(interfaceC3647j);
        }
    }

    public abstract void sendMessage(AbstractC3682n abstractC3682n, AbstractC3633a[] abstractC3633aArr);

    public static void send(AbstractC3682n abstractC3682n, AbstractC3633a[] abstractC3633aArr) throws NoSuchProviderException, SendFailedException {
        abstractC3682n.saveChanges();
        m8194h(abstractC3682n, abstractC3633aArr, null, null);
    }

    public static void send(AbstractC3682n abstractC3682n, String str, String str2) throws NoSuchProviderException, SendFailedException {
        abstractC3682n.saveChanges();
        m8194h(abstractC3682n, abstractC3682n.getAllRecipients(), str, str2);
    }

    public static void send(AbstractC3682n abstractC3682n, AbstractC3633a[] abstractC3633aArr, String str, String str2) throws NoSuchProviderException, SendFailedException {
        abstractC3682n.saveChanges();
        m8194h(abstractC3682n, abstractC3633aArr, str, str2);
    }
}
