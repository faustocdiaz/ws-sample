CREATE FUNCTION addserver(name varchar(50), description varchar(50), location varchar(50), quantity int)
RETURNS INTEGER
AS
'DECLARE
v_id INTEGER;
  BEGIN
	SELECT nextval(''server_seq'') INTO v_id;
	INSERT INTO server (id, name, description, location, quantity) VALUES (v_id, name, description, location, quantity);
	RETURN v_id;
END;'
LANGUAGE 'plpgsql';