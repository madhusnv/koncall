defmodule KoncallApiWeb.ErrorJSONTest do
  use KoncallApiWeb.ConnCase, async: true

  test "renders 404" do
    assert KoncallApiWeb.ErrorJSON.render("404.json", %{}) == %{error: %{status: 404, message: "Not found"}}
  end

  test "renders 500" do
    assert KoncallApiWeb.ErrorJSON.render("500.json", %{}) ==
             %{error: %{status: 500, message: "Internal server error"}}
  end
end

