import org.apache.jmeter.protocol.http.control.Header;
def signaruteProps = props.get("SIGNATURE");
def content = ctx.getCurrentSampler().getArguments().getArgument(0).getValue();

//Set header Signature
sampler.getHeaderManager().add(new Header("Signature", signaruteProps.getSignature(vars.get("sessionKeyRes"), content, false)));

//Set header Request-Id
//sampler.getHeaderManager().add(new Header("Request-Id", vars.get("requestIdPut")));

//Set header Session-Id
//sampler.getHeaderManager().add(new Header("Session-Id", vars.get("sessionIdRes")));

//Set header Token
//sampler.getHeaderManager().add(new Header("Token", vars.get("tokenRes")));