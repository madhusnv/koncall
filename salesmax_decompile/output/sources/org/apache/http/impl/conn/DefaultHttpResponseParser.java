package org.apache.http.impl.conn;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.io.AbstractMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import p001o.eja;
import p001o.sia;

/* loaded from: classes6.dex */
public class DefaultHttpResponseParser extends AbstractMessageParser<HttpResponse> {
    private final CharArrayBuffer lineBuf;
    private final sia log;
    private final HttpResponseFactory responseFactory;

    @Deprecated
    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        eja.m25143k(getClass());
        Args.notNull(httpResponseFactory, "Response factory");
        this.responseFactory = httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
    }

    public boolean reject(CharArrayBuffer charArrayBuffer, int i) {
        return false;
    }

    @Override // org.apache.http.impl.io.AbstractMessageParser
    public HttpResponse parseHead(SessionInputBuffer sessionInputBuffer) throws ProtocolException, NoHttpResponseException {
        this.lineBuf.clear();
        int line = sessionInputBuffer.readLine(this.lineBuf);
        if (line == -1) {
            throw new NoHttpResponseException("The target server failed to respond");
        }
        ParserCursor parserCursor = new ParserCursor(0, this.lineBuf.length());
        if (this.lineParser.hasProtocolVersion(this.lineBuf, parserCursor)) {
            return this.responseFactory.newHttpResponse(this.lineParser.parseStatusLine(this.lineBuf, parserCursor), null);
        }
        if (line == -1 || reject(this.lineBuf, 0)) {
            throw new ProtocolException("The server failed to respond with a valid HTTP response");
        }
        throw null;
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, MessageConstraints messageConstraints) {
        super(sessionInputBuffer, lineParser, messageConstraints);
        eja.m25143k(getClass());
        this.responseFactory = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, messageConstraints);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, MessageConstraints.DEFAULT);
    }
}
