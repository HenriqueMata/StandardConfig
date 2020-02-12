package br.com.pdasolucoes.standardconfig.network.interfaces;

import org.apache.http.HttpEntity;
import org.ksoap2.serialization.SoapObject;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import br.com.pdasolucoes.standardconfig.network.enums.MessageConfiguration;
import br.com.pdasolucoes.standardconfig.network.enums.RequestType;
import br.com.pdasolucoes.standardconfig.network.enums.TypeService;

public interface IRequest extends IAsyncTaskCallback<Void, Object> {

    String getService();

    String getAction();

    RequestType getRequestType();

    boolean getRequireAuthentication();

    String getDescription();

    TypeService getTypeService();

    String getNameSpace();

    void processResult(Object data);

    void processError(MessageConfiguration result);

    void setHandler(IRequestHandler handler);

    Date getRequestTimestamp();

    HttpEntity getRequestEntity() throws UnsupportedEncodingException;

    SoapObject getRequestSoapObject();
}
