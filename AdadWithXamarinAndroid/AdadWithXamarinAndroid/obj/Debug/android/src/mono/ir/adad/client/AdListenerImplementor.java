package mono.ir.adad.client;


public class AdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		ir.adad.client.AdListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdFailedToLoad:()V:GetOnAdFailedToLoadHandler:IR.Adad.Client.IAdListenerInvoker, JarBinding\n" +
			"n_onAdLoaded:()V:GetOnAdLoadedHandler:IR.Adad.Client.IAdListenerInvoker, JarBinding\n" +
			"n_onMessageReceive:(Lorg/json/JSONObject;)V:GetOnMessageReceive_Lorg_json_JSONObject_Handler:IR.Adad.Client.IAdListenerInvoker, JarBinding\n" +
			"n_onRemoveAdsRequested:()V:GetOnRemoveAdsRequestedHandler:IR.Adad.Client.IAdListenerInvoker, JarBinding\n" +
			"";
		mono.android.Runtime.register ("IR.Adad.Client.IAdListenerImplementor, JarBinding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AdListenerImplementor.class, __md_methods);
	}


	public AdListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AdListenerImplementor.class)
			mono.android.TypeManager.Activate ("IR.Adad.Client.IAdListenerImplementor, JarBinding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAdFailedToLoad ()
	{
		n_onAdFailedToLoad ();
	}

	private native void n_onAdFailedToLoad ();


	public void onAdLoaded ()
	{
		n_onAdLoaded ();
	}

	private native void n_onAdLoaded ();


	public void onMessageReceive (org.json.JSONObject p0)
	{
		n_onMessageReceive (p0);
	}

	private native void n_onMessageReceive (org.json.JSONObject p0);


	public void onRemoveAdsRequested ()
	{
		n_onRemoveAdsRequested ();
	}

	private native void n_onRemoveAdsRequested ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
