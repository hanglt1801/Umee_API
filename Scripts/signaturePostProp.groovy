import org.apache.jmeter.protocol.http.control.Header;
def signaruteProps = props.get("SIGNATURE");
def content = ctx.getCurrentSampler().getArguments().getArgument(0).getValue();

//Set header Signature
sampler.getHeaderManager().add(new Header("Signature", signaruteProps.getSignature(props.get("sessionKeyProp"), content, false)));