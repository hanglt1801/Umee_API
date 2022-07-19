import org.apache.jmeter.protocol.http.control.Header;
def signaruteProps = props.get("SIGNATURE");

//Set header Signature
sampler.getHeaderManager().add(new Header("Signature", signaruteProps.getSignature(props.get("sessionKeyProp"), "", false)));