package com.app.LoginRegistration2.entity;
public class Response<T> {
	private Status status;
    private Object errors;
    private Object metadata;

    public static <T> Response<T> badRequest() {
        Response<T> response = new Response<T>();
        response.setStatus(Status.BAD_REQUEST);
        return response;
    }

    public static  Response ok() {
        Response response = new Response();
        response.setStatus(Status.OK);
        return response;
    }

    public static <T> Response unauthorized() {
        Response response = new Response();
        response.setStatus(Status.UNAUTHORIZED);
        return response;
    }

    public static <T> Response validationException() {
        Response response = new Response();
        response.setStatus(Status.VALIDATION_EXCEPTION);
        return response;
    }

    public static <T> Response wrongCredentials() {
        Response response = new Response();
        response.setStatus(Status.WRONG_CREDENTIALS);
        return response;
    }

    public static <T> Response accessDenied() {
        Response response = new Response();
        response.setStatus(Status.ACCESS_DENIED);
        return response;
    }

    public static <T> Response exception() {
        Response response = new Response();
        response.setStatus(Status.EXCEPTION);
        return response;
    }

    public static <T> Response notFound() {
        Response response = new Response();
        response.setStatus(Status.NOT_FOUND);
        return response;
    }

    public static  Response duplicateEntity() {
        Response response = new Response();
        response.setStatus(Status.DUPLICATE_ENTITY);
        return response;
    }

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	public Object getMetadata() {
		return metadata;
	}

	public void setMetadata(Object metadata) {
		this.metadata = metadata;
	}

	public Response setPayload(Response transaction) {
		// TODO Auto-generated method stub
		return transaction;
	}

	public Response setPayload(Transaction sendMoney) {
		// TODO Auto-generated method stub
		return null;
	}
	public Response setPayload1(AccountStatement statement) {
		// TODO Auto-generated method stub
		return null;
	}

	public Response setPayload(AccountStatement statement) {
		// TODO Auto-generated method stub
		return null;
	}
}
