defmodule KoncallApi.CRM.LeadImport do
  @moduledoc """
  Handles CSV import of leads with round-robin distribution to callers.
  """
  alias KoncallApi.CRM
  alias KoncallApi.CRM

  @doc """
  Import leads from CSV content with round-robin distribution to specified users.

  ## Parameters
  - org_id: Organization ID
  - csv_content: Raw CSV string content
  - user_ids: List of user IDs to distribute leads to (round-robin)
  - created_by: User ID who initiated the import

  ## Returns
  {:ok, %{total: n, imported: n, failed: n, errors: [...]}}
  """
  def import_csv_with_distribution(org_id, csv_content, user_ids, created_by) do
    with {:ok, rows} <- parse_csv(csv_content) do
      user_ids_cycle = if Enum.empty?(user_ids), do: [nil], else: user_ids
      user_count = length(user_ids_cycle)
      
      results = rows
      |> Enum.with_index()
      |> Enum.map(fn {row, index} ->
        assigned_to = Enum.at(user_ids_cycle, rem(index, user_count))
        create_lead_from_row(org_id, row, assigned_to, created_by)
      end)
      
      imported = Enum.count(results, fn r -> match?({:ok, _}, r) end)
      failed = Enum.count(results, fn r -> match?({:error, _}, r) end)
      errors = results
        |> Enum.filter(fn r -> match?({:error, _}, r) end)
        |> Enum.take(10)  # Limit error messages
        |> Enum.map(fn {:error, msg} -> msg end)
      
      {:ok, %{
        total: length(rows),
        imported: imported,
        failed: failed,
        errors: errors
      }}
    end
  end

  @doc """
  Parse CSV content into a list of row maps.
  Supports headers: firstName/first_name, lastName/last_name, phoneNumber/phone_number/phone, email
  """
  def parse_csv(csv_content) do
    try do
      lines = String.split(csv_content, ~r/\r?\n/, trim: true)
      
      if length(lines) < 1 do
        {:error, "CSV file is empty"}
      else
        [header_line | data_lines] = lines
        headers = parse_csv_row(header_line)
        
        # Normalize headers
        header_indices = headers
        |> Enum.with_index()
        |> Enum.reduce(%{}, fn {header, idx}, acc ->
          normalized = header |> String.downcase() |> String.replace(~r/[_\s]/, "")
          Map.put(acc, normalized, idx)
        end)
        
        rows = Enum.map(data_lines, fn line ->
          values = parse_csv_row(line)
          
          %{
            first_name: get_value(values, header_indices, ["firstname"]),
            last_name: get_value(values, header_indices, ["lastname"]),
            phone_number: get_value(values, header_indices, ["phonenumber", "phone"]),
            email: get_value(values, header_indices, ["email"])
          }
        end)
        |> Enum.filter(fn row -> 
          row.first_name && row.first_name != "" && 
          row.phone_number && row.phone_number != ""
        end)
        
        {:ok, rows}
      end
    rescue
      e -> {:error, "Failed to parse CSV: #{Exception.message(e)}"}
    end
  end

  defp parse_csv_row(line) do
    # Simple CSV parsing - handles quoted values
    line
    |> String.split(",")
    |> Enum.map(&String.trim/1)
    |> Enum.map(&String.trim(&1, "\""))
  end

  defp get_value(values, header_indices, possible_keys) do
    idx = Enum.find_value(possible_keys, fn key ->
      Map.get(header_indices, key)
    end)
    
    if idx, do: Enum.at(values, idx), else: nil
  end

  defp create_lead_from_row(org_id, row, assigned_to, created_by) do
    # Check for duplicate by phone
    case CRM.get_lead_by_phone(org_id, row.phone_number) do
      nil ->
        attrs = %{
          organization_id: org_id,
          first_name: row.first_name,
          last_name: row.last_name,
          phone_number: row.phone_number,
          email: row.email,
          assigned_to: assigned_to,
          created_by: created_by,
          source: "csv_import"
        }
        
        case CRM.create_lead(attrs) do
          {:ok, _lead} -> {:ok, :created}
          {:error, changeset} -> 
            {:error, "Row #{row.phone_number}: #{format_errors(changeset)}"}
        end
        
      _existing ->
        {:error, "Duplicate: #{row.phone_number}"}
    end
  end

  defp format_errors(%Ecto.Changeset{} = changeset) do
    Ecto.Changeset.traverse_errors(changeset, fn {msg, opts} ->
      Enum.reduce(opts, msg, fn {key, value}, acc ->
        String.replace(acc, "%{#{key}}", to_string(value))
      end)
    end)
    |> Enum.map(fn {k, v} -> "#{k} #{Enum.join(v, ", ")}" end)
    |> Enum.join("; ")
  end
end
