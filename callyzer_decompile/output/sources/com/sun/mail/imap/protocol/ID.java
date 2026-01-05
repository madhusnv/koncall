package com.sun.mail.imap.protocol;

import com.sun.mail.iap.Argument;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ID {
    private Map<String, String> serverParams;

    public ID(Response response) throws ProtocolException {
        this.serverParams = null;
        response.skipSpaces();
        byte bPeekByte = response.peekByte();
        if (bPeekByte == 78 || bPeekByte == 110) {
            return;
        }
        if (bPeekByte != 40) {
            throw new ProtocolException("Missing '(' at start of ID");
        }
        this.serverParams = new HashMap();
        String[] stringList = response.readStringList();
        if (stringList != null) {
            for (int i10 = 0; i10 < stringList.length; i10 += 2) {
                String str = stringList[i10];
                if (str == null) {
                    throw new ProtocolException("ID field name null");
                }
                int i11 = i10 + 1;
                if (i11 >= stringList.length) {
                    throw new ProtocolException("ID field without value: ".concat(str));
                }
                this.serverParams.put(str, stringList[i11]);
            }
        }
        this.serverParams = Collections.unmodifiableMap(this.serverParams);
    }

    public static Argument getArgumentList(Map<String, String> map) {
        Argument argument = new Argument();
        if (map == null) {
            argument.writeAtom("NIL");
            return argument;
        }
        Argument argument2 = new Argument();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            argument2.writeNString(entry.getKey());
            argument2.writeNString(entry.getValue());
        }
        argument.writeArgument(argument2);
        return argument;
    }

    public Map<String, String> getServerParams() {
        return this.serverParams;
    }
}
