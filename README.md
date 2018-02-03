# sessionscope
This sequence show how to read, write, update and delete attributes in Session object. Session Object can act as a Object Store. Servlets can use Session Object as Shared memory store and communicate via attributes. The attributes stored in Session will have same life as Session object, if not removed explicitly.   When combined with authentication, session can also identify a user and help you store user related information. Session Management is key to designing a successful Web Application. 


This code shows how to set the attribute in Session Object. Attributes placed in Session Object are said to have Session Scope. Session related state can be stored using attributes.

The method setAttribute creates the attribute if it doesn't exist in the Session object. However, if the attribute exists it is overwritten silently. Hence setAttribute sometimes plays the role of attribute creation and at other times plays the role of attribute updation.

When you want to create an attribute it is recommended that you first check for it's presence. Otherwise, using setAttribute may inadvertently overwrite someone's attribute.




This code shows how to get the attribute present in the Session Object. Attributes placed in Session Object are said to have Session Scope. Session related state can be stored using attributes.

The method getAttribute return the object corresponding to the attribute. The return type of the getAttribute method is of type Object and hence you may have to typecast it to the type you are expecting. If the attribute doesn't exist in the Session object the method returns null.


This code shows how to remove an attribute present in the given Session Object. Attributes placed in Session Object are said to have Session Scope. Session related state can be stored using these attributes.

The method removeAttribute removes the attribute if it already exists. It has no effect if the attribute doesn't exist.
